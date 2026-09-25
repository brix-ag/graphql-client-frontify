package ch.brix.gql.client.frontify.builders;

public class On_GuidelineDocumentLibraryNavigationItem extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelineDocumentLibraryNavigationItem() {
    super(new ch.brix.gql.client.On("GuidelineDocumentLibraryNavigationItem"));
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentLibraryNavigationItem id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentLibraryNavigationItem title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentLibraryNavigationItem url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA**
   */
  public On_GuidelineDocumentLibraryNavigationItem isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
