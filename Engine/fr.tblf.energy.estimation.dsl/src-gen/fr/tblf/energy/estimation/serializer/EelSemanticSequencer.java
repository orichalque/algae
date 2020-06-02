/*
 * generated by Xtext 2.14.0
 */
package fr.tblf.energy.estimation.serializer;

import com.google.inject.Inject;
import fr.tblf.energy.estimation.eel.EelPackage;
import fr.tblf.energy.estimation.eel.Integral;
import fr.tblf.energy.estimation.eel.Interval;
import fr.tblf.energy.estimation.eel.MeasureAttribute;
import fr.tblf.energy.estimation.eel.MeasureCast;
import fr.tblf.energy.estimation.eel.MeasureOCL;
import fr.tblf.energy.estimation.eel.MeasureUnboundProductOperation;
import fr.tblf.energy.estimation.eel.MeasureUnboundSumOperation;
import fr.tblf.energy.estimation.eel.MeasureValue;
import fr.tblf.energy.estimation.eel.MeasurementUncertainty;
import fr.tblf.energy.estimation.eel.NormalDistribution;
import fr.tblf.energy.estimation.eel.Platform;
import fr.tblf.energy.estimation.eel.RealTimeDuration;
import fr.tblf.energy.estimation.eel.Sample;
import fr.tblf.energy.estimation.eel.Sampling;
import fr.tblf.energy.estimation.eel.Variable;
import fr.tblf.energy.estimation.services.EelGrammarAccess;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EcorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EANNOTATION:
				sequence_EAnnotation(context, (EAnnotation) semanticObject); 
				return; 
			case EcorePackage.EATTRIBUTE:
				sequence_EAttribute(context, (EAttribute) semanticObject); 
				return; 
			case EcorePackage.ECLASS:
				sequence_EClass(context, (EClass) semanticObject); 
				return; 
			case EcorePackage.EDATA_TYPE:
				sequence_EDataType_Impl(context, (EDataType) semanticObject); 
				return; 
			case EcorePackage.EENUM:
				sequence_EEnum(context, (EEnum) semanticObject); 
				return; 
			case EcorePackage.EENUM_LITERAL:
				sequence_EEnumLiteral(context, (EEnumLiteral) semanticObject); 
				return; 
			case EcorePackage.EGENERIC_TYPE:
				sequence_EGenericType(context, (EGenericType) semanticObject); 
				return; 
			case EcorePackage.EOBJECT:
				sequence_EObject(context, (EObject) semanticObject); 
				return; 
			case EcorePackage.EOPERATION:
				sequence_EOperation(context, (EOperation) semanticObject); 
				return; 
			case EcorePackage.EPARAMETER:
				sequence_EParameter(context, (EParameter) semanticObject); 
				return; 
			case EcorePackage.EREFERENCE:
				sequence_EReference(context, (EReference) semanticObject); 
				return; 
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY:
				sequence_EStringToStringMapEntry(context, (Map.Entry) semanticObject); 
				return; 
			case EcorePackage.ETYPE_PARAMETER:
				sequence_ETypeParameter(context, (ETypeParameter) semanticObject); 
				return; 
			}
		else if (epackage == EelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EelPackage.INTEGRAL:
				sequence_Integral(context, (Integral) semanticObject); 
				return; 
			case EelPackage.INTERVAL:
				sequence_Interval(context, (Interval) semanticObject); 
				return; 
			case EelPackage.MEASURE_ATTRIBUTE:
				sequence_MeasureAttribute(context, (MeasureAttribute) semanticObject); 
				return; 
			case EelPackage.MEASURE_CAST:
				sequence_MeasureCast(context, (MeasureCast) semanticObject); 
				return; 
			case EelPackage.MEASURE_OCL:
				sequence_MeasureOCL(context, (MeasureOCL) semanticObject); 
				return; 
			case EelPackage.MEASURE_UNBOUND_PRODUCT_OPERATION:
				sequence_MeasureUnboundProductOperation(context, (MeasureUnboundProductOperation) semanticObject); 
				return; 
			case EelPackage.MEASURE_UNBOUND_SUM_OPERATION:
				sequence_MeasureUnboundSumOperation(context, (MeasureUnboundSumOperation) semanticObject); 
				return; 
			case EelPackage.MEASURE_VALUE:
				sequence_MeasureValue_Impl(context, (MeasureValue) semanticObject); 
				return; 
			case EelPackage.MEASUREMENT_UNCERTAINTY:
				sequence_MeasurementUncertainty(context, (MeasurementUncertainty) semanticObject); 
				return; 
			case EelPackage.NORMAL_DISTRIBUTION:
				sequence_NormalDistribution(context, (NormalDistribution) semanticObject); 
				return; 
			case EelPackage.PLATFORM:
				sequence_Platform(context, (Platform) semanticObject); 
				return; 
			case EelPackage.REAL_TIME_DURATION:
				sequence_RealTimeDuration(context, (RealTimeDuration) semanticObject); 
				return; 
			case EelPackage.SAMPLE:
				sequence_Sample(context, (Sample) semanticObject); 
				return; 
			case EelPackage.SAMPLING:
				sequence_Sampling(context, (Sampling) semanticObject); 
				return; 
			case EelPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EAnnotation returns EAnnotation
	 *
	 * Constraint:
	 *     (
	 *         source=EString? 
	 *         (references+=[EObject|EString] references+=[EObject|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (details+=EStringToStringMapEntry details+=EStringToStringMapEntry*)? 
	 *         (contents+=EObject contents+=EObject*)?
	 *     )
	 */
	protected void sequence_EAnnotation(ISerializationContext context, EAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EStructuralFeature returns EAttribute
	 *     EAttribute returns EAttribute
	 *
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         iD?='iD'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EAttribute(ISerializationContext context, EAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EClass
	 *     EClass returns EClass
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         interface?='interface'? 
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         (eSuperTypes+=[EClass|EString] eSuperTypes+=[EClass|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eOperations+=EOperation eOperations+=EOperation*)? 
	 *         (eStructuralFeatures+=EStructuralFeature eStructuralFeatures+=EStructuralFeature*)? 
	 *         (eGenericSuperTypes+=EGenericType eGenericSuperTypes+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EClass(ISerializationContext context, EClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EDataType
	 *     EDataType_Impl returns EDataType
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)?
	 *     )
	 */
	protected void sequence_EDataType_Impl(ISerializationContext context, EDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EEnumLiteral returns EEnumLiteral
	 *
	 * Constraint:
	 *     (name=EString value=EInt? literal=EString? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_EEnumLiteral(ISerializationContext context, EEnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EEnum
	 *     EEnum returns EEnum
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eLiterals+=EEnumLiteral eLiterals+=EEnumLiteral*)?
	 *     )
	 */
	protected void sequence_EEnum(ISerializationContext context, EEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EGenericType returns EGenericType
	 *
	 * Constraint:
	 *     (
	 *         eTypeParameter=[ETypeParameter|EString]? 
	 *         eClassifier=[EClassifier|EString]? 
	 *         eUpperBound=EGenericType? 
	 *         (eTypeArguments+=EGenericType eTypeArguments+=EGenericType*)? 
	 *         eLowerBound=EGenericType?
	 *     )
	 */
	protected void sequence_EGenericType(ISerializationContext context, EGenericType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EObject returns EObject
	 *
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(ISerializationContext context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EOperation returns EOperation
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eExceptions+=[EClassifier|EString] eExceptions+=[EClassifier|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eParameters+=EParameter eParameters+=EParameter*)? 
	 *         (eGenericExceptions+=EGenericType eGenericExceptions+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EOperation(ISerializationContext context, EOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EParameter returns EParameter
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EParameter(ISerializationContext context, EParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EStructuralFeature returns EReference
	 *     EReference returns EReference
	 *
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         containment?='containment'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         resolveProxies=EBoolean? 
	 *         eType=[EClassifier|EString]? 
	 *         eOpposite=[EReference|EString]? 
	 *         (eKeys+=[EAttribute|EString] eKeys+=[EAttribute|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EReference(ISerializationContext context, EReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EStringToStringMapEntry returns EStringToStringMapEntry
	 *
	 * Constraint:
	 *     (key=EString? value=EString?)
	 */
	protected void sequence_EStringToStringMapEntry(ISerializationContext context, Map.Entry semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETypeParameter returns ETypeParameter
	 *
	 * Constraint:
	 *     (name=EString (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? (eBounds+=EGenericType eBounds+=EGenericType*)?)
	 */
	protected void sequence_ETypeParameter(ISerializationContext context, ETypeParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasurementUncertaintyInformation returns Integral
	 *     Integral returns Integral
	 *
	 * Constraint:
	 *     (function=EString? interval=[Interval|EString])
	 */
	protected void sequence_Integral(ISerializationContext context, Integral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasurementUncertaintyInformation returns Interval
	 *     Interval returns Interval
	 *
	 * Constraint:
	 *     (lowerEndpoint=Measure upperEndpoint=Measure)
	 */
	protected void sequence_Interval(ISerializationContext context, Interval semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EelPackage.Literals.INTERVAL__LOWER_ENDPOINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EelPackage.Literals.INTERVAL__LOWER_ENDPOINT));
			if (transientValues.isValueTransient(semanticObject, EelPackage.Literals.INTERVAL__UPPER_ENDPOINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EelPackage.Literals.INTERVAL__UPPER_ENDPOINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntervalAccess().getLowerEndpointMeasureParserRuleCall_3_0(), semanticObject.getLowerEndpoint());
		feeder.accept(grammarAccess.getIntervalAccess().getUpperEndpointMeasureParserRuleCall_5_0(), semanticObject.getUpperEndpoint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Measure returns MeasureAttribute
	 *     MeasureAttribute returns MeasureAttribute
	 *
	 * Constraint:
	 *     (post?='post'? targetClass=EString targetOperation=EString? (type=Type | subname=EString) att=EString)
	 */
	protected void sequence_MeasureAttribute(ISerializationContext context, MeasureAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Measure returns MeasureCast
	 *     MeasureCast returns MeasureCast
	 *
	 * Constraint:
	 *     (
	 *         post?='post'? 
	 *         targetClass=EString 
	 *         targetOperation=EString? 
	 *         subname=EString 
	 *         measure=[Measure|EString] 
	 *         type=Type
	 *     )
	 */
	protected void sequence_MeasureCast(ISerializationContext context, MeasureCast semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Measure returns MeasureOCL
	 *     MeasureOCL returns MeasureOCL
	 *
	 * Constraint:
	 *     (post?='post'? targetClass=EString targetOperation=EString? (type=Type | subname=EString) oclQuery=EString)
	 */
	protected void sequence_MeasureOCL(ISerializationContext context, MeasureOCL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Measure returns MeasureUnboundProductOperation
	 *     MeasureUnboundProductOperation returns MeasureUnboundProductOperation
	 *
	 * Constraint:
	 *     (
	 *         post?='post'? 
	 *         targetClass=EString 
	 *         targetOperation=EString? 
	 *         (type=Type | subname=EString) 
	 *         measures+=[Measure|EString] 
	 *         measures+=[Measure|EString]+
	 *     )
	 */
	protected void sequence_MeasureUnboundProductOperation(ISerializationContext context, MeasureUnboundProductOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Measure returns MeasureUnboundSumOperation
	 *     MeasureUnboundSumOperation returns MeasureUnboundSumOperation
	 *
	 * Constraint:
	 *     (
	 *         post?='post'? 
	 *         targetClass=EString 
	 *         targetOperation=EString? 
	 *         (type=Type | subname=EString) 
	 *         measures+=[Measure|EString] 
	 *         measures+=[Measure|EString]+
	 *     )
	 */
	protected void sequence_MeasureUnboundSumOperation(ISerializationContext context, MeasureUnboundSumOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Measure returns MeasureValue
	 *     MeasureValue_Impl returns MeasureValue
	 *
	 * Constraint:
	 *     (post?='post'? targetClass=EString targetOperation=EString? (type=Type | subname=EString) value=EBigDecimal?)
	 */
	protected void sequence_MeasureValue_Impl(ISerializationContext context, MeasureValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasurementUncertainty returns MeasurementUncertainty
	 *
	 * Constraint:
	 *     (standardUncertainty=EBigDecimal? information=MeasurementUncertaintyInformation?)
	 */
	protected void sequence_MeasurementUncertainty(ISerializationContext context, MeasurementUncertainty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasurementUncertaintyInformation returns NormalDistribution
	 *     NormalDistribution returns NormalDistribution
	 *
	 * Constraint:
	 *     {NormalDistribution}
	 */
	protected void sequence_NormalDistribution(ISerializationContext context, NormalDistribution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Platform returns Platform
	 *
	 * Constraint:
	 *     (name=EString (variables+=Variable variables+=Variable*)? (measures+=Measure measures+=Measure*)?)
	 */
	protected void sequence_Platform(ISerializationContext context, Platform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Measure returns RealTimeDuration
	 *     RealTimeDuration returns RealTimeDuration
	 *
	 * Constraint:
	 *     (post?='post'? targetClass=EString targetOperation=EString?)
	 */
	protected void sequence_RealTimeDuration(ISerializationContext context, RealTimeDuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sample returns Sample
	 *
	 * Constraint:
	 *     (quantity+=Measure quantity+=Measure*)?
	 */
	protected void sequence_Sample(ISerializationContext context, Sample semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasurementUncertaintyInformation returns Sampling
	 *     Sampling returns Sampling
	 *
	 * Constraint:
	 *     (measurementProcedure=EString? (samples+=Sample samples+=Sample*)?)
	 */
	protected void sequence_Sampling(ISerializationContext context, Sampling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=EString value=EBigDecimal? vibility=Visibility)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
