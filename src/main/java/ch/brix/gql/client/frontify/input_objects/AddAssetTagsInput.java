package ch.brix.gql.client.frontify.input_objects;

public class AddAssetTagsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public AddAssetTagsInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * List of `Tag` values linked to `Asset`.
   */
  public AddAssetTagsInput tags(java.util.List<ch.brix.gql.client.frontify.input_objects.TagInput> v) {
    values.put("tags", v);
    return this;
  }
}
