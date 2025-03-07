package ch.brix.gql.client.frontify.builders;

public class On_AssetLocationLibrary extends ch.brix.gql.client.TypeBuilder {
  public On_AssetLocationLibrary() {
    super(new ch.brix.gql.client.On("AssetLocationLibrary"));
  }
  /**
   * `Library` Id.
   */
  public On_AssetLocationLibrary id() {
    _add_field("id");
    return this;
  }
  /**
   * `Library` name.
   */
  public On_AssetLocationLibrary name() {
    _add_field("name");
    return this;
  }
}
