package ch.brix.gql.client.frontify.input_objects;

public class UpdateGuidelinePageSectionDataInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `label` of the section.
   */
  public UpdateGuidelinePageSectionDataInput label(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("label", v);
    return this;
  }
  /**
   * **BETA** The `columnProportions` for the 24-column layout should be set for the section.
   */
  public UpdateGuidelinePageSectionDataInput columnProportions(java.util.List<ch.brix.gql.client.frontify.scalars.IntScalar> v) {
    values.put("columnProportions", v);
    return this;
  }
  /**
   * **BETA** The `alignment` of the content in the section.
   */
  public UpdateGuidelinePageSectionDataInput alignment(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("alignment", v);
    return this;
  }
  /**
   * **BETA** The `maxWidth` of the section. Needs to be a value including one of the allowed units. (px,vw,rem,%,vh)
   */
  public UpdateGuidelinePageSectionDataInput maxWidth(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("maxWidth", v);
    return this;
  }
  /**
   * **BETA** The `verticalPadding` of the section. Needs to be a value including one of the allowed units. (px,vw,rem,%,vh)
   */
  public UpdateGuidelinePageSectionDataInput verticalPadding(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("verticalPadding", v);
    return this;
  }
  /**
   * **BETA** The `horizontalPadding` of the section. Needs to be a value including one of the allowed units. (px,vw,rem,%,vh)
   */
  public UpdateGuidelinePageSectionDataInput horizontalPadding(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("horizontalPadding", v);
    return this;
  }
  /**
   * **BETA** The `verticalGutter` of the section. Needs to be a value including one of the allowed units. (px,vw,rem,%,vh)
   */
  public UpdateGuidelinePageSectionDataInput verticalGutter(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("verticalGutter", v);
    return this;
  }
  /**
   * **BETA** The `horizontalGutter` of the section. Needs to be a value including one of the allowed units. (px,vw,rem,%,vh)
   */
  public UpdateGuidelinePageSectionDataInput horizontalGutter(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("horizontalGutter", v);
    return this;
  }
  /**
   * **BETA** The id of the color scheme that will be applied to this `GuidelinePageSection`.
   */
  public UpdateGuidelinePageSectionDataInput colorSchemeId(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("colorSchemeId", v);
    return this;
  }
  /**
   * **BETA** The `backgroundFit` of the section.
   */
  public UpdateGuidelinePageSectionDataInput backgroundFit(ch.brix.gql.client.frontify.enums.GuidelinePageSectionBackgroundFit v) {
    values.put("backgroundFit", v);
    return this;
  }
  /**
   * **BETA** Whether the section should have a border or not.
   */
  public UpdateGuidelinePageSectionDataInput hasBorder(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("hasBorder", v);
    return this;
  }
  /**
   * **BETA** The style of the border.
   */
  public UpdateGuidelinePageSectionDataInput borderStyle(ch.brix.gql.client.frontify.enums.GuidelinePageSectionBorderStyle v) {
    values.put("borderStyle", v);
    return this;
  }
  /**
   * **BETA** The width of the border.
   */
  public UpdateGuidelinePageSectionDataInput borderWidth(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("borderWidth", v);
    return this;
  }
  /**
   * **BETA** The color of the border.
   */
  public UpdateGuidelinePageSectionDataInput borderColor(ch.brix.gql.client.frontify.input_objects.RgbaColorInput v) {
    values.put("borderColor", v);
    return this;
  }
  /**
   * **BETA** The `borderRadius` of the section. Needs to be a value including one of the allowed units. (px,vw,rem,%,vh)
   */
  public UpdateGuidelinePageSectionDataInput borderRadius(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("borderRadius", v);
    return this;
  }
}
