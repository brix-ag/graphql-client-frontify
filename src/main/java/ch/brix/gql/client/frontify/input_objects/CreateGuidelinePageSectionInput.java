package ch.brix.gql.client.frontify.input_objects;

public class CreateGuidelinePageSectionInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of `GuidelinePage` on which the `GuidelinePageSection` should be inserted.
   */
  public CreateGuidelinePageSectionInput pageId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("pageId", v);
    return this;
  }
  /**
   * **BETA** The `id` of the `GuidelinePageSection` after which the newly created `GuidelinePageSection` should be inserted. If null or undefined, the `GuidelinePageSection` will be inserted at the beginning of the `GuidelinePage`.
   */
  public CreateGuidelinePageSectionInput afterGuidelinePageSectionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("afterGuidelinePageSectionId", v);
    return this;
  }
}
