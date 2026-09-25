package ch.brix.gql.client.frontify.builders;

public class On_BrandSearchResultEdge extends ch.brix.gql.client.TypeBuilder {
  public On_BrandSearchResultEdge() {
    super(new ch.brix.gql.client.On("BrandSearchResultEdge"));
  }
  /**
   * `BrandSearchResult` title.
   */
  public On_BrandSearchResultEdge title() {
    _add_field("title");
    return this;
  }
  /**
   * `BrandSearchResult` node.
   */
  public On_BrandSearchResultEdge node(BrandSearchResultEdge_node callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
