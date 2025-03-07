package ch.brix.gql.client.frontify.input_objects;

public class UpdateCustomMetadataPropertyInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` Id.
   */
  public UpdateCustomMetadataPropertyInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` data.
   */
  public UpdateCustomMetadataPropertyInput data(ch.brix.gql.client.frontify.input_objects.UpdateCustomMetadataPropertyDataInput v) {
    values.put("data", v);
    return this;
  }
}
