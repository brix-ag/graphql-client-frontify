package ch.brix.gql.client.frontify.builders;

public class On_AssetLocationBrand extends ch.brix.gql.client.TypeBuilder {
  public On_AssetLocationBrand() {
    super(new ch.brix.gql.client.On("AssetLocationBrand"));
  }
  /**
   * `Brand` Id.
   */
  public On_AssetLocationBrand id() {
    _add_field("id");
    return this;
  }
  /**
   * `Brand` name.
   */
  public On_AssetLocationBrand name() {
    _add_field("name");
    return this;
  }
}
