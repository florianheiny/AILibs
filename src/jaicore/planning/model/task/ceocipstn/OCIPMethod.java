package jaicore.planning.model.task.ceocipstn;

import java.util.List;

import jaicore.logic.fol.structure.Literal;
import jaicore.logic.fol.structure.Monom;
import jaicore.logic.fol.structure.VariableParam;
import jaicore.planning.model.task.ceocstn.OCMethod;
import jaicore.planning.model.task.stn.TaskNetwork;

@SuppressWarnings("serial")
public class OCIPMethod extends OCMethod {

	private final Monom evaluablePrecondition;

	public OCIPMethod(String name, List<VariableParam> parameters, Literal task, Monom precondition, TaskNetwork network, boolean lonely, List<VariableParam> outputs,
			Monom evaluablePrecondition) {
		super(name, parameters, task, precondition, network, lonely, outputs);
		this.evaluablePrecondition = evaluablePrecondition;
	}

	public Monom getEvaluablePrecondition() {
		return evaluablePrecondition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((evaluablePrecondition == null) ? 0 : evaluablePrecondition.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		OCIPMethod other = (OCIPMethod) obj;
		if (evaluablePrecondition == null) {
			if (other.evaluablePrecondition != null)
				return false;
		} else if (!evaluablePrecondition.equals(other.evaluablePrecondition))
			return false;
		return true;
	}
}
