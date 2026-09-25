package ch.brix.gql.client.frontify.input_objects;

public class SetCustomMetadataInput extends ch.brix.gql.client.InputObject {
  /**
   * List of `parentIds` where `CustomMetadata` should be set.
   */
  public SetCustomMetadataInput parentIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("parentIds", v);
    return this;
  }
  /**
   * `CustomMetadata` to be set to the list of `parentIds`.
   */
  public SetCustomMetadataInput customMetadata(java.util.List<ch.brix.gql.client.frontify.input_objects.CustomMetadataInput> v) {
    values.put("customMetadata", v);
    return this;
  }
}
