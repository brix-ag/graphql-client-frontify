package ch.brix.gql.client.frontify.builders;

public class On_UpdateBrand extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateBrand() {
    super(new ch.brix.gql.client.On("UpdateBrand"));
  }
  /**
   * The updated `Brand`.
   */
  public On_UpdateBrand brand(UpdateBrand_brand callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
