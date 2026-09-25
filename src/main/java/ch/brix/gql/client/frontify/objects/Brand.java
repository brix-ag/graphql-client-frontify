package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Brand implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `Brand` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `Brand` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `Brand` color.
   */
  @com.google.gson.annotations.SerializedName("rgbaColor")
  private ch.brix.gql.client.frontify.objects.RgbaColor rgbaColor;
  /**
   * `Brand` avatar.
   */
  @com.google.gson.annotations.SerializedName("avatar")
  private ch.brix.gql.client.frontify.scalars.UrlScalar avatar;
  /**
   * `Brand` slug.
   */
  @com.google.gson.annotations.SerializedName("slug")
  private ch.brix.gql.client.frontify.scalars.StringScalar slug;
  /**
   * **DEPRECATED** Retrieve all `Projects`. This field will be removed. Use `libraries` or `workspaceProjects` instead. | Date: 2023-01-01
   * This field will be removed. Use `libraries` or `workspaceProjects` instead. | Date: 2023-01-01
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("projects")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.unions.Project.class)
  private java.util.List<ch.brix.gql.client.frontify.unions.Project> projects;
  /**
   * Retrieve all `Library` items.
   */
  @com.google.gson.annotations.SerializedName("libraries")
  private ch.brix.gql.client.frontify.objects.LibraryItems libraries;
  /**
   * Retrieve all `Workspace` items.
   */
  @com.google.gson.annotations.SerializedName("workspaceProjects")
  private ch.brix.gql.client.frontify.objects.WorkspaceItems workspaceProjects;
  /**
   * **BETA** Paginated list of `Guideline` items for `Brand`.
   */
  @com.google.gson.annotations.SerializedName("guidelines")
  private ch.brix.gql.client.frontify.objects.GuidelineItems guidelines;
  /**
   * `Brand` `CustomMetadataProperty` items list.
   */
  @com.google.gson.annotations.SerializedName("customMetadataProperties")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CustomMetadataProperty.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataProperty> customMetadataProperties;
  /**
   * Retrieve all `CreativeTemplate` items.
   */
  @com.google.gson.annotations.SerializedName("creativeTemplates")
  private ch.brix.gql.client.frontify.objects.CreativeTemplateItems creativeTemplates;
  /**
   * **BETA** The brand essentials.
   */
  @com.google.gson.annotations.SerializedName("essentials")
  private ch.brix.gql.client.frontify.objects.BrandEssentials essentials;
  /**
   * **BETA** Search for the assets on the brand level.
   */
  @com.google.gson.annotations.SerializedName("search")
  private ch.brix.gql.client.frontify.objects.BrandSearchItems search;
  /**
   * **BETA** Enhanced search for the assets on the brand level. Includes natural search and exact term search
   */
  @com.google.gson.annotations.SerializedName("enhancedSearch")
  private ch.brix.gql.client.frontify.objects.BrandEnhancedSearchItems enhancedSearch;
}
