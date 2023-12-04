package ch.brix.gql.client.frontify.builders;

public class RootMutation_inviteProjectUser extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.InviteProjectUser> {
  public RootMutation_inviteProjectUser() {
    super(new ch.brix.gql.client.Call<>("inviteProjectUser", "InviteProjectUser"));
  }
  public RootMutation_inviteProjectUser args(RootMutation_inviteProjectUser_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_inviteProjectUser onInviteProjectUser(On_InviteProjectUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
