package ch.brix.gql.client.frontify.builders;

public class On_Brand extends ch.brix.gql.client.TypeBuilder {
  public On_Brand() {
    super(new ch.brix.gql.client.On("Brand"));
  }
  /**
   * `Brand` Id.
   */
  public On_Brand id() {
    _add_field("id");
    return this;
  }
  /**
   * `Brand` name.
   */
  public On_Brand name() {
    _add_field("name");
    return this;
  }
  /**
   * **DEPRECATED** `Brand` color. This field will be removed. Use `rgbaColor` instead. | Date: 2023-01-01T00:00:00.000+00:00
   * This field will be removed. Use `rgbaColor` instead. | Date: 2023-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Brand color() {
    _add_field("color");
    return this;
  }
  /**
   * `Brand` color.
   */
  public On_Brand rgbaColor(Brand_rgbaColor callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Brand` avatar.
   */
  public On_Brand avatar() {
    _add_field("avatar");
    return this;
  }
  /**
   * `Brand` slug.
   */
  public On_Brand slug() {
    _add_field("slug");
    return this;
  }
  /**
   * **DEPRECATED** Retrieve all `Projects`. This field will be removed. Use `libraries` or `workspaceProjects` instead. | Date: 2023-01-01T00:00:00.000+00:00
   * This field will be removed. Use `libraries` or `workspaceProjects` instead. | Date: 2023-01-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_Brand projects(Brand_projects callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Search for the assets on the brand level.
   */
  public On_Brand search(Brand_search callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve all `Library` items.
   */
  public On_Brand libraries(Brand_libraries callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve all `Workspace` items.
   */
  public On_Brand workspaceProjects(Brand_workspaceProjects callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Brand` `CustomMetadataProperty` items list.
   */
  public On_Brand customMetadataProperties(Brand_customMetadataProperties callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Retrieve all `CreativeTemplate` items.
   */
  public On_Brand creativeTemplates(Brand_creativeTemplates callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
