package ch.brix.gql.client.frontify.builders;

public class On_GuidelineContentSearchResult extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineContentSearchResult() {
    super(new ch.brix.gql.client.On("GuidelineContentSearchResult"));
  }
  /**
   * **BETA** The guideline content that matched.
   */
  public On_GuidelineContentSearchResult content(GuidelineContentSearchResult_content callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
