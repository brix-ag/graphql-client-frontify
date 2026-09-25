package ch.brix.gql.client.frontify.input_objects;

public class UpdateGuidelinePageBlockSettingsInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `GuidelinePageBlock` which should be modified.
   */
  public UpdateGuidelinePageBlockSettingsInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The locale tag ("de", "de-DE") in which the settings of the `GuidelinePageBlock` should be updated. It is optional and when not provided, the settings will be updated in the main language.
   */
  public UpdateGuidelinePageBlockSettingsInput locale(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("locale", v);
    return this;
  }
  /**
   * **BETA** The `language` in which the settings of the `GuidelinePageBlock` should be updated. It is optional and when not provided, the settings will be updated in the main language.
   */
  public UpdateGuidelinePageBlockSettingsInput language(ch.brix.gql.client.frontify.enums.LanguageCode v) {
    values.put("language", v);
    return this;
  }
  /**
   * **BETA** The `settings` of the `GuidelinePageBlock` which should be updated. The settings must be provided as a JSON string.
   */
  public UpdateGuidelinePageBlockSettingsInput settings(ch.brix.gql.client.frontify.scalars.JsonObjectScalar v) {
    values.put("settings", v);
    return this;
  }
}
