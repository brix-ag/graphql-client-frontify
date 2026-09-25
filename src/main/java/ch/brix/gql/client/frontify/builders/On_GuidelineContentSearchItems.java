package ch.brix.gql.client.frontify.builders;

public class On_GuidelineContentSearchItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineContentSearchItems() {
    super(new ch.brix.gql.client.On("GuidelineContentSearchItems"));
  }
  /**
   * **BETA** The results, in the order the search engine ranked them, which is the order they are meant to be shown in.
   */
  public On_GuidelineContentSearchItems items(GuidelineContentSearchItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Whether the search engine holds results beyond the requested page.
   */
  public On_GuidelineContentSearchItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
}
