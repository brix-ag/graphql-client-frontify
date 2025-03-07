package ch.brix.gql.client.frontify.input_objects;

public class AddCustomMetadataInput extends ch.brix.gql.client.InputObject {
  /**
   * Set of parent Ids to which `CustomMetadata` should be added.
   */
  public AddCustomMetadataInput parentIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("parentIds", v);
    return this;
  }
  /**
   * `CustomMetadata` property and respective values to add to the given set of parents.
   */
  public AddCustomMetadataInput customMetadata(java.util.List<ch.brix.gql.client.frontify.input_objects.CustomMetadataInput> v) {
    values.put("customMetadata", v);
    return this;
  }
}
