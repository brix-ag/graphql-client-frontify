package ch.brix.gql.client.frontify.builders;

public class CustomMetadataPropertyCustomPermission_subject extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.unions.AccountCollaborator> {
  public CustomMetadataPropertyCustomPermission_subject() {
    super(new ch.brix.gql.client.Call<>("subject", "AccountCollaborator"));
  }
  public CustomMetadataPropertyCustomPermission_subject onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataPropertyCustomPermission_subject onUserGroup(On_UserGroup typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
