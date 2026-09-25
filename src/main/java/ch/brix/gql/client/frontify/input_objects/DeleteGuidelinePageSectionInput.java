package ch.brix.gql.client.frontify.input_objects;

public class DeleteGuidelinePageSectionInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `GuidelinePageSection` that should be deleted.
   */
  public DeleteGuidelinePageSectionInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
