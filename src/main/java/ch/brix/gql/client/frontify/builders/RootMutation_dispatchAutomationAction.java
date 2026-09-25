package ch.brix.gql.client.frontify.builders;

public class RootMutation_dispatchAutomationAction extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DispatchAutomationAction> {
  public RootMutation_dispatchAutomationAction() {
    super(new ch.brix.gql.client.Call<>("dispatchAutomationAction", "DispatchAutomationAction"));
  }
  public RootMutation_dispatchAutomationAction args(RootMutation_dispatchAutomationAction_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_dispatchAutomationAction onDispatchAutomationAction(On_DispatchAutomationAction typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
