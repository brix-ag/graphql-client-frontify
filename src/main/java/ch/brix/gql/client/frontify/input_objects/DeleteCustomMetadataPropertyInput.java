package ch.brix.gql.client.frontify.input_objects;

public class DeleteCustomMetadataPropertyInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` Id.
   */
  public DeleteCustomMetadataPropertyInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
