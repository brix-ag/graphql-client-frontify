package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelinePageSection extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelinePageSection() {
    super(new ch.brix.gql.client.On("CreateGuidelinePageSection"));
  }
  /**
   * **BETA** The `GuidelinePageSection` that was just created.
   */
  public On_CreateGuidelinePageSection section(CreateGuidelinePageSection_section callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
