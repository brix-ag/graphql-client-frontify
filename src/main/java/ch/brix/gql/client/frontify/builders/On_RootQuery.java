package ch.brix.gql.client.frontify.builders;

public class On_RootQuery extends ch.brix.gql.client.TypeBuilder {
  public On_RootQuery() {
    super(new ch.brix.gql.client.On("RootQuery"));
  }
  /**
   * Get the current `User`.
   */
  public On_RootQuery currentUser(RootQuery_currentUser callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve current `Account` details.
   */
  public On_RootQuery account(RootQuery_account callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Retrieve `Project` details by Id. This field will be removed. Use `library` or `workspaceProject` instead. | Date: 2023-01-01T00:00:00.000+00:00
   * This field will be removed. Use `library` or `workspaceProject` instead. | Date: 2023-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_RootQuery project(RootQuery_project callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve `Library` details by Id.
   */
  public On_RootQuery library(RootQuery_library callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve `WorkspaceProject` details by Id.
   */
  public On_RootQuery workspaceProject(RootQuery_workspaceProject callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve `WebhookItems` related to current `Account`.
   */
  public On_RootQuery webhooks(RootQuery_webhooks callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve `Assets` details by Ids.
   */
  public On_RootQuery assets(RootQuery_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve `Asset` details by Id.
   */
  public On_RootQuery asset(RootQuery_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Retrieve a `CreativeTemplate` item by Id.
   */
  public On_RootQuery creativeTemplate(RootQuery_creativeTemplate callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Retrieve a `CreativeExport` item by `CreativeJob` Id.
   */
  public On_RootQuery creativeExport(RootQuery_creativeExport callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve a `Brand` by its Id.
   */
  public On_RootQuery brand(RootQuery_brand callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve `Brand` list for current `Account`.
   */
  public On_RootQuery brands(RootQuery_brands callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve `Node` details by Id.
   */
  public On_RootQuery node(RootQuery_node callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
