package ch.brix.gql.client.frontify.input_objects;

public class DeleteMetadataFieldInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `MetadataField` to delete.
   */
  public DeleteMetadataFieldInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
