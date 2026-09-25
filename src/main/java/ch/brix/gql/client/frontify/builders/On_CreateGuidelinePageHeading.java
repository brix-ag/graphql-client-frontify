package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelinePageHeading extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelinePageHeading() {
    super(new ch.brix.gql.client.On("CreateGuidelinePageHeading"));
  }
  /**
   * **BETA** The `GuidelinePageHeading` that was created.
   */
  public On_CreateGuidelinePageHeading heading(CreateGuidelinePageHeading_heading callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
