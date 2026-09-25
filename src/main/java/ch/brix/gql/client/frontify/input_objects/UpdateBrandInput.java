package ch.brix.gql.client.frontify.input_objects;

public class UpdateBrandInput extends ch.brix.gql.client.InputObject {
  /**
   * `Brand` id.
   */
  public UpdateBrandInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `Brand` data.
   */
  public UpdateBrandInput data(ch.brix.gql.client.frontify.input_objects.UpdateBrandDataInput v) {
    values.put("data", v);
    return this;
  }
}
