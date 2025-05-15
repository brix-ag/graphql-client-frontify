package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageSection extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageSection() {
    super(new ch.brix.gql.client.On("GuidelinePageSection"));
  }
  /**
   * **BETA** `GuidelinePageSection` id.
   */
  public On_GuidelinePageSection id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** `GuidelinePageSectionElement` that are located within this `GuidelinePageSection`.
   */
  public On_GuidelinePageSection elements(GuidelinePageSection_elements callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
