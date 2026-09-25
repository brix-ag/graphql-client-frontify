package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentNavigationItem extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentNavigationItem() {
    super(new ch.brix.gql.client.On("GuidelineDocumentNavigationItem"));
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentNavigationItem title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentNavigationItem url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentNavigationItem isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentNavigationItem id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentNavigationItem children(GuidelineDocumentNavigationItem_children callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
