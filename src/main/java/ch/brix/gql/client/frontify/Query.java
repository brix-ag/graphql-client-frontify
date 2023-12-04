package ch.brix.gql.client.frontify;

public class Query {
  /**
   * Get the current `User`.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_currentUser currentUser() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_currentUser();
  }
  /**
   * Retrieve a `Brand` by its Id.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_brand brand() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_brand();
  }
  /**
   * Retrieve current `Account` details.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_account account() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_account();
  }
  /**
   * **DEPRECATED** Retrieve `Project` details by Id. This field will be removed. Use `library` or `workspaceProject` instead. | Date: 2023-01-01T00:00:00.000+00:00
   * This field will be removed. Use `library` or `workspaceProject` instead. | Date: 2023-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public static ch.brix.gql.client.frontify.builders.RootQuery_project project() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_project();
  }
  /**
   * Retrieve `Library` details by Id.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_library library() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_library();
  }
  /**
   * Retrieve `WorkspaceProject` details by Id.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_workspaceProject workspaceProject() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_workspaceProject();
  }
  /**
   * Retrieve `WebhookItems` related to current `Account`.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_webhooks webhooks() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_webhooks();
  }
  /**
   * Retrieve `Assets` details by Ids.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_assets assets() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_assets();
  }
  /**
   * Retrieve `Brand` list for current `Account`.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_brands brands() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_brands();
  }
  /**
   * Retrieve `Asset` details by Id.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_asset asset() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_asset();
  }
  /**
   * Retrieve `Node` details by Id.
   */
  public static ch.brix.gql.client.frontify.builders.RootQuery_node node() {
    return new ch.brix.gql.client.frontify.builders.RootQuery_node();
  }
}
