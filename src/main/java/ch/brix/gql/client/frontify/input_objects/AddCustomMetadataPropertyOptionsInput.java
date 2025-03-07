package ch.brix.gql.client.frontify.input_objects;

public class AddCustomMetadataPropertyOptionsInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` Id.
   */
  public AddCustomMetadataPropertyOptionsInput propertyId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("propertyId", v);
    return this;
  }
  /**
   * List of `CustomMetadataPropertyOption` items to add to existing `CustomMetadataProperty`.
   */
  public AddCustomMetadataPropertyOptionsInput options(java.util.List<ch.brix.gql.client.frontify.input_objects.AddCustomMetadataPropertyOptionInput> v) {
    values.put("options", v);
    return this;
  }
}
