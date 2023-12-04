package ch.brix.gql.client.frontify.input_objects;

public class DeleteAssetInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `Asset` to delete.
   */
  public DeleteAssetInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
