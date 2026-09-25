package ch.brix.gql.client.frontify.input_objects;

public class CreateGuidelinePageBlockInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `GuidelinePageBlockType` of the block to create.
   */
  public CreateGuidelinePageBlockInput blockTypeId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("blockTypeId", v);
    return this;
  }
  /**
   * **BETA** The `settings` of the block, as defined by the block type's `settingsSchema`. Only api-writable settings may be provided; required fields must be present.
   */
  public CreateGuidelinePageBlockInput settings(ch.brix.gql.client.frontify.scalars.JsonObjectScalar v) {
    values.put("settings", v);
    return this;
  }
  /**
   * **BETA** The `id` of the `GuidelinePageSection` to create the block in.
   */
  public CreateGuidelinePageBlockInput sectionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("sectionId", v);
    return this;
  }
  /**
   * **BETA** The element after which the block is created. Omit to create it first in the section.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public CreateGuidelinePageBlockInput afterElementId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("afterElementId", v);
    return this;
  }
}
