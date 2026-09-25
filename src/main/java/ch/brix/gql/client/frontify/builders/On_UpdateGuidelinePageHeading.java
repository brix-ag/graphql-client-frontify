package ch.brix.gql.client.frontify.builders;

public class On_UpdateGuidelinePageHeading extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateGuidelinePageHeading() {
    super(new ch.brix.gql.client.On("UpdateGuidelinePageHeading"));
  }
  /**
   * **BETA** The `GuidelinePageHeading` that was modified.
   */
  public On_UpdateGuidelinePageHeading heading(UpdateGuidelinePageHeading_heading callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
