package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelinePageSection extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelinePageSection() {
    super(new ch.brix.gql.client.On("UpdateGuidelinePageSection"));
  }
  /**
   * **BETA** The `Section` that was modified.
   */
  public On_UpdateGuidelinePageSection section(UpdateGuidelinePageSection_section callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
