package ch.brix.gql.client.frontify.builders;

public class On_HideGuidelineDocumentFromNavigation extends ch.brix.gql.client.TypeBuilder {
  public On_HideGuidelineDocumentFromNavigation() {
    super(new ch.brix.gql.client.On("HideGuidelineDocumentFromNavigation"));
  }
  /**
   * **BETA** The ID of the guideline document hidden from the navigation.
   */
  public On_HideGuidelineDocumentFromNavigation id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document is hidden in navigation.
   */
  public On_HideGuidelineDocumentFromNavigation isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
