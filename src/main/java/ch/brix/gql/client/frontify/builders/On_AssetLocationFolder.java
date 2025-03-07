package ch.brix.gql.client.frontify.builders;

public class On_AssetLocationFolder extends ch.brix.gql.client.TypeBuilder {
  public On_AssetLocationFolder() {
    super(new ch.brix.gql.client.On("AssetLocationFolder"));
  }
  /**
   * `Folder` Id.
   */
  public On_AssetLocationFolder id() {
    _add_field("id");
    return this;
  }
  /**
   * `Folder` name.
   */
  public On_AssetLocationFolder name() {
    _add_field("name");
    return this;
  }
  /**
   * A list of `Breadcrumb` items representing the parent folders structure for the current `Folder`.
   */
  public On_AssetLocationFolder breadcrumbs(AssetLocationFolder_breadcrumbs callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
