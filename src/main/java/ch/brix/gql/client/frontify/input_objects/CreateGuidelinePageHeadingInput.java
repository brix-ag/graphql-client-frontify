package ch.brix.gql.client.frontify.input_objects;

public class CreateGuidelinePageHeadingInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `GuidelinePageSection` on which the `GuidelinePageHeading` should be created.
   */
  public CreateGuidelinePageHeadingInput sectionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("sectionId", v);
    return this;
  }
  /**
   * **BETA** The `title` for the `GuidelinePageHeading` that should be created.
   */
  @ch.brix.gql.client.DefaultValue("\"\"")
  public CreateGuidelinePageHeadingInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** If given, the `GuidelinePageHeading` is created directly after this element, which must be in the same `GuidelinePageSection` as `sectionId`. When omitted, the `GuidelinePageHeading` is created in the first position of the `GuidelinePageSection`.
   */
  public CreateGuidelinePageHeadingInput afterElementId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("afterElementId", v);
    return this;
  }
}
