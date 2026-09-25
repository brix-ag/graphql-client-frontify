package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentPageNavigationItem extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentPageNavigationItem() {
    super(new ch.brix.gql.client.On("GuidelineDocumentPageNavigationItem"));
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageNavigationItem id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageNavigationItem title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageNavigationItem url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageNavigationItem isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageNavigationItem isPublished() {
    _add_field("isPublished");
    return this;
  }
}
