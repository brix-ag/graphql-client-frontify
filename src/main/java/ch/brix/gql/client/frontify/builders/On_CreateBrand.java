package ch.brix.gql.client.frontify.builders;

public class On_CreateBrand extends ch.brix.gql.client.TypeBuilder {
  public On_CreateBrand() {
    super(new ch.brix.gql.client.On("CreateBrand"));
  }
  /**
   * The newly created `Brand`.
   */
  public On_CreateBrand brand(CreateBrand_brand callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
