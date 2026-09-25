package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentPageLinkNavigationItem extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentPageLinkNavigationItem() {
    super(new ch.brix.gql.client.On("GuidelineDocumentPageLinkNavigationItem"));
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageLinkNavigationItem id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageLinkNavigationItem title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageLinkNavigationItem url() {
    _add_field("url");
    return this;
  }
}
