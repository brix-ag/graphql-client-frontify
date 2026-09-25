package ch.brix.gql.client.frontify.builders;

public class On_DeleteBrand extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteBrand() {
    super(new ch.brix.gql.client.On("DeleteBrand"));
  }
  /**
   * The deleted `Brand` id.
   */
  public On_DeleteBrand id() {
    _add_field("id");
    return this;
  }
}
