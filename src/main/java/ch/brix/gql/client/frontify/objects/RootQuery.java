package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RootQuery {
  /**
   * Get the current `User`.
   */
  @com.google.gson.annotations.SerializedName("currentUser")
  private ch.brix.gql.client.frontify.interfaces.User currentUser;
  /**
   * Retrieve current `Account` details.
   */
  @com.google.gson.annotations.SerializedName("account")
  private ch.brix.gql.client.frontify.objects.Account account;
  /**
   * **DEPRECATED** Retrieve `Project` details by Id. This field will be removed. Use `library` or `workspaceProject` instead. | Date: 2023-01-01T00:00:00.000+00:00
   * This field will be removed. Use `library` or `workspaceProject` instead. | Date: 2023-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("project")
  private ch.brix.gql.client.frontify.unions.Project project;
  /**
   * Retrieve `Library` details by Id.
   */
  @com.google.gson.annotations.SerializedName("library")
  private ch.brix.gql.client.frontify.interfaces.Library library;
  /**
   * Retrieve `WorkspaceProject` details by Id.
   */
  @com.google.gson.annotations.SerializedName("workspaceProject")
  private ch.brix.gql.client.frontify.objects.Workspace workspaceProject;
  /**
   * Retrieve `WebhookItems` related to current `Account`.
   */
  @com.google.gson.annotations.SerializedName("webhooks")
  private ch.brix.gql.client.frontify.objects.WebhookItems webhooks;
  /**
   * Retrieve `Assets` details by Ids.
   */
  @com.google.gson.annotations.SerializedName("assets")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.Asset.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.Asset> assets;
  /**
   * Retrieve `Asset` details by Id.
   */
  @com.google.gson.annotations.SerializedName("asset")
  private ch.brix.gql.client.frontify.interfaces.Asset asset;
  /**
   * **BETA** Retrieve a `CreativeTemplate` item by Id.
   */
  @com.google.gson.annotations.SerializedName("creativeTemplate")
  private ch.brix.gql.client.frontify.objects.CreativeTemplate creativeTemplate;
  /**
   * **BETA** Retrieve a `CreativeExport` item by `CreativeJob` Id.
   */
  @com.google.gson.annotations.SerializedName("creativeExport")
  private ch.brix.gql.client.frontify.objects.CreativeExport creativeExport;
  /**
   * Retrieve a `Brand` by its Id.
   */
  @com.google.gson.annotations.SerializedName("brand")
  private ch.brix.gql.client.frontify.objects.Brand brand;
  /**
   * Retrieve `Brand` list for current `Account`.
   */
  @com.google.gson.annotations.SerializedName("brands")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Brand.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.Brand> brands;
  /**
   * Retrieve `Node` details by Id.
   */
  @com.google.gson.annotations.SerializedName("node")
  private ch.brix.gql.client.frontify.interfaces.Node node;
}
