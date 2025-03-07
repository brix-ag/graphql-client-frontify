package ch.brix.gql.client.frontify.input_objects;

public class DeleteBrandInput extends ch.brix.gql.client.InputObject {
  /**
   * `Brand` id.
   */
  public DeleteBrandInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
