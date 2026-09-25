package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelinePageBlockSettings extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelinePageBlockSettings() {
    super(new ch.brix.gql.client.On("UpdateGuidelinePageBlockSettings"));
  }
  /**
   * **BETA** The `GuidelinePageBlock` which settings were updated.
   */
  public On_UpdateGuidelinePageBlockSettings block(UpdateGuidelinePageBlockSettings_block callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
