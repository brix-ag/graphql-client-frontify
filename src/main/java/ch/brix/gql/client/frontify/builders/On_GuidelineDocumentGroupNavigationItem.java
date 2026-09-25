package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentGroupNavigationItem extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentGroupNavigationItem() {
    super(new ch.brix.gql.client.On("GuidelineDocumentGroupNavigationItem"));
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentGroupNavigationItem title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentGroupNavigationItem isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentGroupNavigationItem id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentGroupNavigationItem children(GuidelineDocumentGroupNavigationItem_children callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
