package ch.brix.gql.client.frontify.input_objects;

public class RemoveMetadataValueInput extends ch.brix.gql.client.InputObject {
  /**
   * `MetadataValue` Id.
   */
  public RemoveMetadataValueInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
