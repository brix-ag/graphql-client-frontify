package ch.brix.gql.client.frontify.input_objects;

public class RemoveCustomMetadataInput extends ch.brix.gql.client.InputObject {
  /**
   * List of parent Ids where `CustomMetadata` should be removed from.
   */
  public RemoveCustomMetadataInput parentIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("parentIds", v);
    return this;
  }
  /**
   * `CustomMetadata` to be removed from the list of parent Ids.
   */
  public RemoveCustomMetadataInput customMetadata(java.util.List<ch.brix.gql.client.frontify.input_objects.CustomMetadataInput> v) {
    values.put("customMetadata", v);
    return this;
  }
}
