package ch.brix.gql.client.frontify.builders;

public class On_ShowGuidelineDocumentGroupInNavigation extends ch.brix.gql.client.TypeBuilder {
  public On_ShowGuidelineDocumentGroupInNavigation() {
    super(new ch.brix.gql.client.On("ShowGuidelineDocumentGroupInNavigation"));
  }
  /**
   * **BETA** The ID of the guideline document group shown in the navigation.
   */
  public On_ShowGuidelineDocumentGroupInNavigation id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document group is hidden in navigation.
   */
  public On_ShowGuidelineDocumentGroupInNavigation isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
