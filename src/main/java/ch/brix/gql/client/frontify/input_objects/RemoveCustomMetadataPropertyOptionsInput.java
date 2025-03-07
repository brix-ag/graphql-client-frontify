package ch.brix.gql.client.frontify.input_objects;

public class RemoveCustomMetadataPropertyOptionsInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` Id.
   */
  public RemoveCustomMetadataPropertyOptionsInput propertyId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("propertyId", v);
    return this;
  }
  /**
   * `CustomMetadataPropertyOption` Ids.
   */
  public RemoveCustomMetadataPropertyOptionsInput optionIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("optionIds", v);
    return this;
  }
}
