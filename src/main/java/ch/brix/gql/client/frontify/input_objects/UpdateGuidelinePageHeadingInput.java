package ch.brix.gql.client.frontify.input_objects;

public class UpdateGuidelinePageHeadingInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `GuidelinePageHeading` that should be updated.
   */
  public UpdateGuidelinePageHeadingInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** `GuidelinePageHeading` data.
   */
  public UpdateGuidelinePageHeadingInput data(ch.brix.gql.client.frontify.input_objects.UpdateGuidelinePageHeadingDataInput v) {
    values.put("data", v);
    return this;
  }
  /**
   * **BETA** Language code the `title` is written in. Omit it to update the title in the main language.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public UpdateGuidelinePageHeadingInput language(ch.brix.gql.client.frontify.enums.LanguageCode v) {
    values.put("language", v);
    return this;
  }
  /**
   * **BETA** The locale tag ("de", "de-DE") the `title` is written in. Omit it to update the title in the main language.
   */
  @ch.brix.gql.client.DefaultValue("null")
  public UpdateGuidelinePageHeadingInput locale(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("locale", v);
    return this;
  }
}
