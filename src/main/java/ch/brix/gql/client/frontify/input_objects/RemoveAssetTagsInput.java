package ch.brix.gql.client.frontify.input_objects;

public class RemoveAssetTagsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public RemoveAssetTagsInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `Asset` tags.
   */
  public RemoveAssetTagsInput tags(java.util.List<ch.brix.gql.client.frontify.input_objects.TagInput> v) {
    values.put("tags", v);
    return this;
  }
}
