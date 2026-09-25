package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentPageCategoryNavigationItem extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentPageCategoryNavigationItem() {
    super(new ch.brix.gql.client.On("GuidelineDocumentPageCategoryNavigationItem"));
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageCategoryNavigationItem title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageCategoryNavigationItem url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageCategoryNavigationItem id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentPageCategoryNavigationItem children(GuidelineDocumentPageCategoryNavigationItem_children callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
