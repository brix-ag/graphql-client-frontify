package ch.brix.gql.client.frontify.input_objects;

public class UpdateGuidelinePageSectionInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The `id` of the `GuidelinePageSection` that should be updated.
   */
  public UpdateGuidelinePageSectionInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * **BETA** The properties of the section that should be updated.
   */
  public UpdateGuidelinePageSectionInput data(ch.brix.gql.client.frontify.input_objects.UpdateGuidelinePageSectionDataInput v) {
    values.put("data", v);
    return this;
  }
  /**
   * **BETA** The locale tag ("de", "de-DE") in which the `GuidelinePageSection` should be updated. Is only respected when using a translatable field, like f.e. `label`.
   */
  public UpdateGuidelinePageSectionInput locale(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("locale", v);
    return this;
  }
}
