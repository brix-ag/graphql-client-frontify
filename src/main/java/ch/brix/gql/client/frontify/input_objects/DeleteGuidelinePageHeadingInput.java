package ch.brix.gql.client.frontify.input_objects;

public class DeleteGuidelinePageHeadingInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `GuidelinePageHeading` to delete.
   */
  public DeleteGuidelinePageHeadingInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
